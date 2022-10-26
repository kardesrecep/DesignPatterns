package StructuralDP.Composite;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDirectorate extends Department{
    List<Department>childDepartments;

    //child departmalari parametre olarak alan constructor

    public RegionalDirectorate(List<Department> childDepartments){
        this.childDepartments=childDepartments;

    }

    @Override
    String getName() {
        return childDepartments.stream().
                map(Department::getName).
                collect(Collectors.joining(", "));
        //Joining -->akistaki iafadeleri birlestirip String dondurur
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().
                flatMap(d->d.getEmployees().stream()).
                collect(Collectors.toList());

        //Flatmap:


    }
}
