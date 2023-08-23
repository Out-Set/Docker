package com.project.docker.DockerProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class Controller {

    @RequestMapping("/")
    public Map<String, Object> getValues(){
        Map<String, Object> data = new HashMap<>();

        data.put("Messange", "Java API Working File");
        data.put("Languages", Arrays.asList("Java", "Python", "JavaScript"));
        data.put("Project", "Docker Project");

        return data;
    }
}
