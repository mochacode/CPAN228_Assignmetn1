package com.cpan228.Assignment1.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {
    @NotBlank
    private int id;
    private String name;
    @Max(2021)
    private int year;
    @DecimalMin(value = "00.00", inclusive = true)
    @DecimalMax(value = "1000.00", inclusive = true)
    private BigDecimal price;
    private Brand brandFrom;

    public enum Brand {
        DIOR("Dior"), CHANEL("Chanel"), HERMES("Hermes"), PRADA("Prada"), LOUIS_VUITTON("Louis Vuitton");

        private String title;

        private Brand(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}