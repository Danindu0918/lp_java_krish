import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Client } from '../add-client-model';

@Component({
  selector: 'app-manage-client',
  templateUrl: './manage-client.component.html',
  styleUrls: ['./manage-client.component.css']
})
export class ManageClientComponent implements OnInit {
  @Input() client: Client
  @Output() onEditClient =new EventEmitter<number>();

  constructor() {
    this.client = {
   
    fName :  '',
    lName : '',
    birthday :  '',
    gender :  '',
    branch :  '',
    interest : 0,
    amount :  0,
    profile :  '',
    }
   }

  ngOnInit(): void {
    console.log(this.client);
  }

  editClientClick(){
    this.onEditClient.emit(this.client.id);
  }

}
