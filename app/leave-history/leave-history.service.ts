import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LeaveHistory } from './LeaveHistory';

@Injectable({
  providedIn: 'root'
})
export class LeaveHistoryService {
 
 empid=localStorage.getItem("userId"); 
 

  constructor(private http: HttpClient) { }
  getDetails():Observable<LeaveHistory[]>{
    var a = this.empid;
    return this.http.get<LeaveHistory[]>('http://localhost:8080/ftp92/api/leavedetails/'+a+'/leaveHistory');
}
}

