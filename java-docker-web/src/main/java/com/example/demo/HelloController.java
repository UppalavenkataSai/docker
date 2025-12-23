package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
            <h1>Java Spring Boot in Docker 🚀</h1>
            <p>This Java application is containerized using Docker.</p>

            <h2>DevOps Skills</h2>
            <ul>
                <li>Docker & Containerization</li>
                <li>CI/CD Pipelines</li>
                <li>Kubernetes</li>
                <li>Monitoring & Logging</li>
            </ul>

            <h2>Cloud Platforms</h2>
            <ul>
                <li>AWS (EC2, EKS)</li>
                <li>Azure (AKS)</li>
                <li>Google Cloud (GKE)</li>
            </ul>
        """;
    }
}
