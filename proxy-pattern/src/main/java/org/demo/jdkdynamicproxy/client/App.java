package org.demo.jdkdynamicproxy.client;

import org.demo.jdkdynamicproxy.client.model.Student;
import org.demo.jdkdynamicproxy.client.repository.StudentRepository;
import org.demo.jdkdynamicproxy.zpa.impl.SimpleZPARepository;
import org.demo.jdkdynamicproxy.zpa.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class App {
    public static void main(String[] args) {
        StudentRepository repository = (StudentRepository) Proxy.newProxyInstance(App.class.getClassLoader(),
                new Class[]{StudentRepository.class}, new DynamicProxy(new SimpleZPARepository<>()));

        Student student = new Student();
        student.setName("Zayar Linn Naung");
        student.setAge(22);
        student.setAddress("-");
        repository.save(student);
    }
}
