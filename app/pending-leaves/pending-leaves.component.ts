import { Component, OnInit } from '@angular/core';
import { Leavedetails } from './pendingleaves';
import { PendingleavesService } from './pendingleaves.service';


@Component({
  selector: 'app-pending-leaves',
  templateUrl: './pending-leaves.component.html',
  styleUrls: ['./pending-leaves.component.css']
})
export class PendingLeavesComponent implements OnInit {
  pdleaves:Leavedetails[];
  constructor(private pdl:PendingleavesService) {}

  ngOnInit() {
    this.pdl.getLeavedetails().subscribe(p=>this.pdleaves=p);
   }
}
