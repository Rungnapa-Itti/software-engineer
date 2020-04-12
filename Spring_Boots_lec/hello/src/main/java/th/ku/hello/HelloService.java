package th.ku.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// เปลี่ยน port ได้ที่ไฟล์ application.properties
// จะสร้าง bean oblect นี้โดยอัตโนมัติ
@RestController
// จะมาเรียกใช้ class นี้
//localhost:8080/greeting/..(method).... (ไม่มี greeting ได้ ถ้าเอาออกจะเข้าถึง method โดยตรง)
@RequestMapping({"/greeting"})
// คลาสนี้ควรอยู่ในโฟเดอร์ main
public class HelloService {

    //เหมือน http , มาที่ /hello จะมาที่ method นี้
    //localhost:8080/greeting/hello
    @GetMapping("/hello")
    public String hello(){
        return "<html><h1>Hello<h1><html>"; //ทำเป็นตัวใหญ่ได้แต่ไม่ควร
    }

    @GetMapping("/hi")
    public String hi(){
        return "SELECT * FROM greeting/hello";
    }

    @GetMapping("/myname")
    public String name(){
        return "Rungnapa";
    }

}
