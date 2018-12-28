import { Component, OnInit } from '@angular/core';
import { applyleave } from './applyleave';
import { ApplyleaveService } from './applyleave.service';

@Component({
  selector: 'app-applyleave',
  templateUrl: './applyleave.component.html',
  styleUrls: ['./applyleave.component.css']
})
export class ApplyleaveComponent implements OnInit {
  applyleaves:applyleave[];
  msg: string;
  err: string;
  userid:string;
  
  constructor(private applyserv:ApplyleaveService ) { }
  ngOnInit() {
    this.userid = localStorage.getItem("userId");
    }
    
    display(sForm){
    
    var id = sForm.value.piempid;
    localStorage.setItem("empID",id);
    var sDate = sForm.value.sdate;
    localStorage.setItem("stDate",sDate);
    var eDate = sForm.value.edate;
    localStorage.setItem("endDate",eDate);
    var appliedon = sForm.value.adate;
    localStorage.setItem("appliedOn",appliedon)
    var  leaveType = sForm.value.ltype;
    localStorage.setItem("leaveType",leaveType)
    var leaveReason = sForm.value.reason;
    localStorage.setItem("lReason",leaveReason);
    console.log(id),
    console.log(sDate),
    console.log(eDate),
    console.log(appliedon),
    console.log(leaveType),
    console.log(leaveReason),
    this.applyserv.applyLeavePost().subscribe( data => {this.msg = data},
      error => {this.err = error.error.text
            });
    console.log(this.msg)
    console.log("leave applied succesfully")
    return this.err;
  }
}

