import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './employee';
import { PendingleavesService } from './pending-leaves/pendingleaves.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  //template:`<app-pending-leaves></app-pending-leaves>`,
  //template:`<app-applyleave></app-applyleave>`,
 // template:`<app-login-form></app-login-form>`,
  styleUrls: ['./app.component.css'],
  providers: [ EmployeeService,PendingleavesService ]
})
export class AppComponent implements OnInit {
  constructor(private employeeService: EmployeeService) { }

  title = 'Leave Management Application';
  employees: Employee[];

  getEmployees(): void {
      this.employeeService.getEmployees().subscribe(data=>this.employees=data,err=>console.log(err));
    
  }

  ngOnInit(): void {
    this.getEmployees();
  }
}
