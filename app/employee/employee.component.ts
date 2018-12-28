import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers: [ EmployeeService ]
})
export class EmployeeComponent implements OnInit {
  constructor(private router:Router, private employeeService: EmployeeService) { }

  title = 'Leave Management Application';
  employees: Employee[];

  getEmployees(): void {
      this.employeeService.getEmployees().subscribe(data=>this.employees=data,err=>console.log(err));
    
  }

  ngOnInit(): void {
    this.getEmployees();
  }
  emp(empId)
  {
    var uid=empId;
    localStorage.setItem("userId",empId);
    console.log(uid);
    this.router.navigate(["login"]);
  }
}
