import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { Leavedetails } from './pendingleaves';

@Injectable({
  providedIn: 'root'
})
export class PendingleavesService {
  empid=localStorage.getItem("userId"); 
  getProduct(): any {
  }
    constructor(private http: HttpClient) {
    }

getLeavedetails(): Observable<Leavedetails[]> {
console.log('getEmployees pendingleaves called on pendingLeave.service');
var a = this.empid;
return this.http.get<Leavedetails[]>('http://localhost:8080/ftp92/api/leavedetails/'+a+'');
   
}
}
