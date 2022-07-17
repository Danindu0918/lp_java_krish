import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormControl, FormControlName, FormGroup } from '@angular/forms';
import { Client } from '../add-client-model';
import { AddClientService } from '../add-client.service';


@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrls: ['./add-client.component.css']
})
export class AddClientComponent implements OnInit, AfterViewInit {
  @ViewChild('fileInput') fileInput: any;
  @ViewChild('addClientButton') addClientButton: any;
  title = 'amn_frontend';

  clientForm: FormGroup;

  clients: Client[];
  clientsToDisplay: Client[];
  typeOptions = [
    'Savings',
    'Diposit',
    'Check Deposit',
    'Withdrawal'
  ];

  constructor(private fb: FormBuilder, private addClientService: AddClientService) {
    this.clientForm = fb.group({});
    this.clients = [];
    this.clientsToDisplay = this.clients;
   }

   ngAfterViewInit(): void{
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
    });
  }

  editClient(event : any){
    this.clients.forEach((val, ind) => {
      if(val.id === event){
        this.setForm(val);
      }
    });
    this.addClientButton.nativeElement.click();
  }

  searchClients(event : any){
    let filteredClients : Client[] = [];

    if(event == ''){
      this.clientsToDisplay = this.clients;
    }else{
      filteredClients = this.clients.filter((val, index) =>{
          let targetKey = val.fName.toLowerCase() + '' + val.lName.toLowerCase();
          let searchKey = event.toLowerCase();
          return targetKey.includes(searchKey);
      });
      this.clientsToDisplay = filteredClients;
    }

  }

  setForm(cli: Client){
    this.FirstName.setValue(cli.fName);
    this.LastName.setValue(cli.lName);
    this.Birthday.setValue(cli.birthday);
    this.Gender.setValue(cli.gender);
    this.Branch.setValue(cli.branch);
    this.Interest.setValue(cli.interest);
    this.Amount.setValue(cli.amount);
    this.fileInput.nativeElement.value = '';
  }

  clearForm(){
    this.FirstName.setValue('');
    this.LastName.setValue('');
    this.Birthday.setValue('');
    this.Gender.setValue('');
    this.Branch.setValue('');
    this.Interest.setValue('');
    this.Amount.setValue('');this.fileInput.nativeElement.value = '';
  }

  public get FirstName(): FormControl{
    return this.clientForm.get('fName') as FormControl;
  }
  public get LastName(): FormControl{
    return this.clientForm.get('fName') as FormControl;
  }
  public get Birthday(): FormControl{
    return this.clientForm.get('fName') as FormControl;
  }
  public get Gender(): FormControl{
    return this.clientForm.get('fName') as FormControl;
  }
  public get Branch(): FormControl{
    return this.clientForm.get('fName') as FormControl;
  }
  public get Interest(): FormControl{
    return this.clientForm.get('fName') as FormControl;
  }
  public get Amount(): FormControl{
    return this.clientForm.get('fName') as FormControl;
  }

}
