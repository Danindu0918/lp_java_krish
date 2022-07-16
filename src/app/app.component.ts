import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { AddClientService } from './add-client.service';
import { Client } from './client-module/add-client-model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, AfterViewInit{
 
  @ViewChild('tempButton') buttonTemp: any;
  title = 'amn_frontend';
  
  clientForm = FormGroup;

  clients: Client[];
  clientsToDisplay: Client[];
  typeOptions = [
    'Savings',
    'Diposit',
    'Check Deposit',
    'Withdrawal'
  ];

  constructor(private fb: FormBuilder, private addClientService: AddClientService){
    this.clientForm = fb.group({});
    this.clients = [];
    this.clientsToDisplay = this.clients;
  }

  ngAfterViewInit(): void{
    this.buttonTemp.nativeElement.click();
  }

  ngOnInit(): void {
    this.clientForm = this.fb.group({
      fName: this.fb.control(''),
      lName: this.fb.control(''),
      birthday: this.fb.control(''),
      gender: this.fb.control(''),
      branch: this.fb.control(''),
      intrest: this.fb.control(''),
      amount: this.fb.control(''),
    })

    
    // this.addClientService.get
  }
}
