import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApplyleaveService {
  empid=localStorage.getItem("userId"); 

  constructor(private http:HttpClient) { }

  applyLeavePost():Observable<any> {
  var emp = localStorage.getItem("empID");
  var startDate = localStorage.getItem("stDate");
  var endDate = localStorage.getItem("endDate");
  var appliedOn = localStorage.getItem("appliedOn");
  var leaveType = localStorage.getItem("leaveType");
  var reason = localStorage.getItem("lReason");
  var a = this.empid;
  console.log("empId is "+a)
  console.log("star"+startDate)
  console.log("end"+endDate)
  console.log("applied"+appliedOn)
  console.log("type"+leaveType)
  console.log("reason "+reason)
  
    return this.http.post('http://localhost:8080/ftp92/api/leavedetails/applyleave/'+a+'',
    // {
    //   "empId":emp,
    //   "leaveStartDate":startDate,
    //   "leaveEndDate":endDate,
    //   "leaveType":leaveType,
    //   "leaveReason":reason,
    //   "leaveAppliedOn":appliedOn,
    // }
    {"leaveStartDate":startDate,"leaveEndDate":endDate,"leaveType":leaveType,"leaveReason":reason});

  }
}