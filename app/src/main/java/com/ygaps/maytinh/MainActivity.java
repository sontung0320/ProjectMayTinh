package com.ygaps.maytinh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int so_tt;
    private String str1;
    private TextView tv_so;
    private TextView tv_tinh;
    private TextView tv_nho;
    private Button b_PhanTram;
    private Double toantu1;
    private Double kqnho=0.0 ;
    private int pheptoan;//1 cong, 2 tru, 3 nhan, 4 chia,5 mu


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_so = (TextView) findViewById(R.id.tv_number);
        tv_nho =(TextView) findViewById(R.id.tv_nho);
        tv_tinh = (TextView) findViewById(R.id.tv_tinh);
        b_PhanTram = (Button) findViewById(R.id.b_PhanTram);
        b_PhanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //B1: lấy chuỗi từ giao diện
                    String str = tv_so.getText().toString();
                    //B2: chuyển chuỗi thành dữ liệu và xử lý
                    double d = Double.parseDouble(str);
                    d = d / 100;
                    //B3: chuyển dữ liệu thành chuỗi và hiển thị
                    str = String.valueOf(d);
                    //xoa số .0 nếu là trường 12.0
                    int leng = str.length();
                    if (leng > 0 &&
                            str.charAt(leng - 1) == '0' &&
                            str.charAt(leng - 2) == '.') {

                        str = str.substring(0, leng - 2);
                    }
                    tv_so.setText(str);
                } catch (Exception ex) {
                }
            }
        });


        so_tt = SO_TRANG_THAI.TRANG_THAI_1;

    }

    public void on_click_phep_cong(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = str1 + "+";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        so_tt = SO_TRANG_THAI.TRANG_THAI_2;
        pheptoan = 1;
    }
    public void on_click_phep_tru(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = str1 + "-";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        so_tt = SO_TRANG_THAI.TRANG_THAI_2;
        pheptoan = 2;
    }
    public void on_click_phep_nhan(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = str1 + "*";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        so_tt = SO_TRANG_THAI.TRANG_THAI_2;
        pheptoan = 3;
    }

    public void on_click_phep_chia(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = str1 + "/";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        so_tt = SO_TRANG_THAI.TRANG_THAI_2;
        pheptoan = 4;
    }
    public void on_click_mu(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = str1 + "^";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        so_tt = SO_TRANG_THAI.TRANG_THAI_2;
        pheptoan = 5;
    }
    public void on_click_can(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "√" + str1;
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq = Math.sqrt(toantu1);
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_sin(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "sin(" + str1 +")";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq = Math.sin(Math.toRadians(toantu1));
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_cos(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "cos(" + str1 +")";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq = Math.cos(Math.toRadians(toantu1));
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_tan(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "tan(" + str1 +")";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq = Math.tan(Math.toRadians(toantu1));
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_log(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "log(" + str1 +")";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq = Math.log10(toantu1);
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_ln(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "ln(" + str1 +")";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq = Math.log(toantu1);
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_e(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "e";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq = Math.E;
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_1chia(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = "1/" + str1;
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        Double kq =1/toantu1;
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_giaithua(View v){
        String str = tv_so.getText().toString();
        str1 = tv_tinh.getText().toString();
        str1 = str1 +"!";
        tv_tinh.setText(str1);
        toantu1 = Double.parseDouble(str);
        long kq=1;
        if (toantu1 == 0 || toantu1 == 1) {
            kq=1;
        }
        else {
            for (int i = 2; i<=toantu1; i++) {
                kq=kq*i;
            }
        }
        str = String.valueOf(kq);
        tv_so.setText(str);
    }
    public void on_click_congnho(View v) {
        String str = tv_so.getText().toString();
        toantu1 = Double.parseDouble(str);
        kqnho = kqnho + toantu1;
        tv_nho.setText("M+");
    }
    public void on_click_trunho(View v) {
        String str = tv_so.getText().toString();
        toantu1 = Double.parseDouble(str);
        kqnho = kqnho - toantu1;
        tv_nho.setText("M-");
    }
    public void on_click_kqnho(View v) {
        String str = String.valueOf(kqnho);
        tv_so.setText(str);
    }
    public void on_click_xoanho(View v) {

        kqnho = 0.0;
        tv_nho.setText("");
    }





    public void on_click_bang(View v){
        if(toantu1 != null && pheptoan >= 1 && pheptoan <= 5){
            String str = tv_so.getText().toString();
            Double toantu2 = Double.parseDouble(str);
            if(pheptoan == 1) {
                Double kq = toantu1 + toantu2;
                str = String.valueOf(kq);
                int leng = str.length();
                if (leng > 0 &&
                        str.charAt(leng - 1) == '0' &&
                        str.charAt(leng - 2) == '.') {

                    str = str.substring(0, leng - 2);
                }
                tv_so.setText(str);
            }
            else if(pheptoan == 2) {
                Double kq = toantu1 - toantu2;
                str = String.valueOf(kq);
                int leng = str.length();
                if (leng > 0 &&
                        str.charAt(leng - 1) == '0' &&
                        str.charAt(leng - 2) == '.') {

                    str = str.substring(0, leng - 2);
                }
                tv_so.setText(str);
            }
            else if(pheptoan == 3){
                Double kq = toantu1 * toantu2;
                str = String.valueOf(kq);
                int leng = str.length();
                if (leng > 0 &&
                        str.charAt(leng - 1) == '0' &&
                        str.charAt(leng - 2) == '.') {

                    str = str.substring(0, leng - 2);
                }
                tv_so.setText(str);
            }else if(pheptoan == 4) {
                if (toantu2 == 0) {
                    Toast.makeText(MainActivity.this, "Not a number", Toast.LENGTH_SHORT).show();
                    //tv_so.setText("Not a number");
                    so_tt = SO_TRANG_THAI.TRANG_THAI_2;
                    return;
                }
                Double kq = toantu1 / toantu2;
                str = String.valueOf(kq);
                int leng = str.length();
                if (leng > 0 &&
                        str.charAt(leng - 1) == '0' &&
                        str.charAt(leng - 2) == '.') {

                    str = str.substring(0, leng - 2);
                }
                tv_so.setText(str);
            }
            else if(pheptoan == 5) {
                Double kq = Math.pow(toantu1,toantu2);
                str = String.valueOf(kq);
                int leng = str.length();
                if (leng > 0 &&
                        str.charAt(leng - 1) == '0' &&
                        str.charAt(leng - 2) == '.') {

                    str = str.substring(0, leng - 2);
                }
                tv_so.setText(str);
            }}
    }

    public void on_click_so(View v){
        Button b = (Button) v;
        str1 = String.format("%s%s", tv_tinh.getText(), b.getText());
        tv_tinh.setText(str1);
        if(so_tt == SO_TRANG_THAI.TRANG_THAI_1){
            String str = String.format("%s%s", tv_so.getText(), b.getText());
            double d;
            boolean kiemtraso;
            try {
                d = Double.parseDouble(str);//chuyen chuoi thanh so
                kiemtraso = true;//chuyen thanh so thanh cong
            } catch (Exception ex){
                d = 0;
                kiemtraso = false;//chuyen thanh so bi loi
            }
//            if(str.equals("x.")){//kiem tra dinh dang (kiem tra so dien thoai ...)
//
//            }else
            if(kiemtraso == true){
                //lay gia tri moi
                //str = String.valueOf(d);
                if(str.charAt(0) == '0'){
                    if(str.charAt(1) != '.') {
                        //xoa chu so 0 tai dau
                        str = str.substring(1);
                    }
                }
            }else{
                //giu gia tri cua textbox
                str = tv_so.getText().toString();
            }
            tv_so.setText(str);
        }else if(so_tt == SO_TRANG_THAI.TRANG_THAI_2){
            tv_so.setText(b.getText());
            so_tt = SO_TRANG_THAI.TRANG_THAI_1;
            
        }
    }

    public void on_click_ac(View v){

        tv_so.setText("0");
        tv_tinh.setText("");
    }

    public void on_click_am_duong(View v){
        try {
            String str = tv_so.getText().toString();
            double d = Double.parseDouble(str);
            if(d > 0){
                str = "-" + str;
            }else if(d == 0){

            }else{
                str = str.substring(1);
            }
            tv_so.setText(str);
        } catch (Exception ex){
        }
    }

    public static class SO_TRANG_THAI{
        public static int TRANG_THAI_1 = 1;//khi nhan thi cong tv voi gia tri nut nhan
        public static int TRANG_THAI_2 = 2;//khi nhan thi gan gia tri tv bang gia tri nut nhan => chuyen ve trang thai 1 lai
    }
}















