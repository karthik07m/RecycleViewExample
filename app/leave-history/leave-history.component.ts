import { Component, OnInit } from '@angular/core';
import { LeaveHistory } from './LeaveHistory';
import { LeaveHistoryService } from './leave-history.service';

@Component({
  selector: 'app-leave-history',
  templateUrl: './leave-history.component.html',
  styleUrls: ['./leave-history.component.css']
})
export class LeaveHistoryComponent implements OnInit {
  ld : LeaveHistory[];
  constructor(private lvd : LeaveHistoryService) { }

  ngOnInit() {
    this.lvd.getDetails().subscribe(l=> this.ld = l);
  }

}
