package com.fithou.vanson.certificate_motor_a1.model;
/**
 * Created by vanso on 3/22/2017.
 */

public class Custom_Row_Answer {

    // Lưu trạng thái được chọn hay không ?
    private boolean bit;
    // Lưu nội dung
    private String text;
    // Chon đặt màu nền không
    private boolean colorBackground;

    public Custom_Row_Answer(String _text,boolean _setColorBg){
        this.text = _text;
        this.colorBackground = _setColorBg;
    }

    public boolean isBit() {
        return bit;
    }

    public void setBit(boolean bit) {
        this.bit = bit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isColorBackground() {
        return colorBackground;
    }
}
