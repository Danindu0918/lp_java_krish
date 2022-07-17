import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Client } from './client-module/add-client-model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
 
 
  
  clientForm = FormGroup;

  

  constructor(){
    
  }

 

  ngOnInit(): void {
 
  }

}
