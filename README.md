TrustLayer AI

Overview

TrustLayer AI is a backend trust layer designed to help organizations use artificial intelligence safely with control. It works as a gateway between users and AI models so that access policies, logging, cost visibility, and routing decisions remain centralized. The focus is operational trust, compliance awareness, and safe AI adoption.

Hackathon Context

This project was built as part of the 2 Fast 2 MCP hackathon. The objective was to design a practical trust layer for safe AI adoption while demonstrating controlled model access, observability, and structured backend architecture. The work reflects rapid prototyping under real constraints while focusing on scalable backend design and responsible AI integration.

Core Idea

Many teams adopt AI quickly without strong visibility or governance. This project introduces a controlled layer that manages how AI models are accessed, how usage is tracked, and how policies are enforced.

Architecture

Controller layer handles incoming API requests.
Service layer processes business logic, routing, logging, and policy checks.
Model layer carries request and response data objects.
Security layer defines access rules.
MCP integration layer connects external AI tools safely.
Utility layer supports cost estimation and helper logic.
Configuration layer manages application setup.

Features

Central AI gateway.
Policy enforcement before model access.
Usage logging for audit and visibility.
Cost estimation capability.
Modular backend architecture for extension.

Tech Stack

Java
Spring Boot
REST APIs
Maven build system
Docker containerization
SQL based logging support

Project Structure

src main java trustlayer contains application code.
src main resources contains configuration and SQL schema.
src test java trustlayer contains test classes.
docker folder contains container setup.
pom.xml manages dependencies and build.

Getting Started

Clone the repository.
Build using Maven.
Run the Spring Boot application.
Access endpoints through a REST client or browser.

Example Flow

Client sends request to chat endpoint.
Gateway checks policy and routes request.
Model interaction occurs through a controlled adapter.
Usage is logged and response returned.

Future Scope

Policy driven AI governance.
Advanced observability and metrics.
Multi model routing intelligence.
Enterprise authentication integration.

Author

Built by Shivansh Bagga
