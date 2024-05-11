package ru.neoflex.practice.Controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@OpenAPIDefinition(
        info = @Info(
                title = "Онлайн калькулятор",
                version = "0.0.1",
                description = "Сложение и вычитание"
        )
)

@RestController
@SpringBootApplication
public class CalcController
{
    @GetMapping("/plus/{a}/{b}")
    public static int amount(@PathVariable int a, @PathVariable int b)
    {
        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public static int subtraction(@PathVariable int a, @PathVariable int b)
    {
        return a - b;
    }
}

