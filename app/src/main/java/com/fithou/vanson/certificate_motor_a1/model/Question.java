package com.fithou.vanson.certificate_motor_a1.model;

import java.util.ArrayList;

/**
 * Created by vanson on 3/20/2017.
 */

public class Question {
    private String description; // Nội dung của câu hỏi
    private ArrayList<String> answer; // Các đáp án để lựa chọn
    private ArrayList<Integer> result; // Đáp án đúng
    private String pathImage; // Đường dẫn ảnh nết có
    private ArrayList<Integer> userRsult;

    public Question(String _description, ArrayList<String> _answer, ArrayList<Integer> _result, String _pathImage) {
        this.description = _description;
        this.answer = _answer;
        this.result = _result;
        this.pathImage = _pathImage;
        this.userRsult = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }

    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public ArrayList<Integer> getUserRsult() {
        return userRsult;
    }

    public void setUserRsult(ArrayList<Integer> userRsult) {
        this.userRsult = userRsult;
    }
}
