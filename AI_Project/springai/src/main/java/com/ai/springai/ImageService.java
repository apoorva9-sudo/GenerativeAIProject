
package com.ai.springai;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.ai.retry.NonTransientAiException;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    private final OpenAiImageModel openAiImageModel;

    public ImageService(OpenAiImageModel openAiImageModel) {
        this.openAiImageModel = openAiImageModel;
    }

    public ImageResponse generateImage(String prompt) {
        try {
            return openAiImageModel.call(
                    new ImagePrompt(prompt,
                            OpenAiImageOptions.builder()
                                    .model("gpt-image-1")
                                    .N(4)  // number of images
                                    .height(1024)
                                    .width(1024)
                                    .build())
            );
        } catch (NonTransientAiException e) {
            // Log error
            System.err.println("OpenAI API Error: " + e.getMessage());

            // Custom handling: return empty response or throw custom exception
            throw new RuntimeException("Image generation failed: " + extractUserFriendlyMessage(e));
        }
    }

    private String extractUserFriendlyMessage(Exception e) {
        String message = e.getMessage();
        if (message != null && message.contains("billing_hard_limit_reached")) {
            return "Your OpenAI account billing limit has been reached. Please upgrade your plan or wait for quota reset.";
        }
        return "Unexpected error occurred while generating image.";
    }
}

