import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes} from '@angular/router'
import { HttpClientModule } from '@angular/common/http';
import { PendingLeavesComponent } from './pending-leaves/pending-leaves.component';
import { ApplyleaveComponent } from './applyleave/applyleave.component';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { EmployeeComponent } from './employee/employee.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LeaveHistoryComponent } from './leave-history/leave-history.component';

const appRoute : Routes = [
  {path:"history", component :LeaveHistoryComponent},
  {path :"", redirectTo:"emp", pathMatch:"full"},
  {path :"emp", component:EmployeeComponent },
  {path:"login", component:LoginFormComponent},
  {path:"dashboard", component:DashboardComponent},
  {path:"pending", component: PendingLeavesComponent},
  {path:"ApplyLeave", component:ApplyleaveComponent},
  {path:"dashboard", component:DashboardComponent}
  ];

@NgModule({
  declarations: [
    AppComponent,
    LeaveHistoryComponent,
    LoginFormComponent,
    PendingLeavesComponent,
    ApplyleaveComponent,
    EmployeeComponent,
    DashboardComponent,
  ],
  imports: [
    BrowserModule,HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoute)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
