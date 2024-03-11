package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// User class representing users who create and respond to surveys
class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Question class representing individual questions in a survey
class Question {
    private String questionText;
    private List<String> options;

    public Question(String questionText, List<String> options) {
        this.questionText = questionText;
        this.options = new ArrayList<>(options);
    }

    // Getters and setters
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}

// Response class representing responses to survey questions
class Response {
    private User respondent;
    private Question question;
    private String answer;

    public Response(User respondent, Question question, String answer) {
        this.respondent = respondent;
        this.question = question;
        this.answer = answer;
    }

    // Getters and setters
    public User getRespondent() {
        return respondent;
    }

    public void setRespondent(User respondent) {
        this.respondent = respondent;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

// Survey class representing a collection of questions and responses
class Survey {
    private String title;
    private List<Question> questions;
    private List<Response> responses;

    public Survey(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
        this.responses = new ArrayList<>();
    }

    // Method to add a question to the survey
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Method to add a response to the survey
    public void addResponse(Response response) {
        responses.add(response);
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }
}

// DatabaseManager class for handling database connectivity
class DatabaseManager {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/survey_system";
    private static final String JDBC_USER = "your_username";
    private static final String JDBC_PASSWORD = "your_password";

//

