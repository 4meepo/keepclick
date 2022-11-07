package com.example.keepclick;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String userDir = System.getProperty("user.dir");
        ImagePath.add(userDir);
        Screen s = new Screen();
        while (true) {
            try {
                Thread.sleep(1000);
                s.click("imgs/send_button.png");
            } catch (FindFailed e) {
                System.out.println("点击 `发送` 按钮失败!");
                continue;
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                return;
            }
            System.out.println("点击 `发送` 按钮成功.");
        }
    }
}
