import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-lista-pessoas',
  templateUrl: './lista-pessoas.component.html',
  styleUrls: ['./lista-pessoas.component.css']
})
export class ListaPessoasComponent implements OnInit {
  
  constructor(private http: HttpClient) { }

  greetins: String = '';

  pessoas: String[] = [];

  ngOnInit() {
    this.getGrettings();
    this.getPessoas();
  }

  getGrettings() {
    this.http.get('http://localhost:8081/greetings', { responseType: "text" } ).subscribe(response => {
      this.greetins = response;
      console.log(response);
    }, error => {
      console.log(error);
    });
  }

  getPessoas() {
    this.http.get<String[]>('http://localhost:8081/').subscribe(response => {
      response.forEach(res => {
        console.log(res);
      });
      this.pessoas = response;
    }, error => {
      console.log(error);
    })
  }
}
