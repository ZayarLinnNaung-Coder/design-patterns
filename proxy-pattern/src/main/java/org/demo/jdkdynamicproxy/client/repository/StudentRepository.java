package org.demo.jdkdynamicproxy.client.repository;

import org.demo.jdkdynamicproxy.client.model.Student;
import org.demo.jdkdynamicproxy.zpa.repository.ZPARepository;

public interface StudentRepository extends ZPARepository<Student, Integer> {
}
