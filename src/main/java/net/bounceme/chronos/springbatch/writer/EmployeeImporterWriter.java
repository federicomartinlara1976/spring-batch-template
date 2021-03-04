package net.bounceme.chronos.springbatch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import net.bounceme.chronos.springbatch.model.Employee;

public class EmployeeImporterWriter implements ItemWriter<Employee> {

    @Override
    public void write(List<? extends Employee> items) throws Exception {
        for (Employee employee : items) {
            System.out.println(employee.toString());
        }
    }

}
