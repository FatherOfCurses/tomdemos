import { Component } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';

// interface describes what the Greeting called below will look like 

interface GreetingResponse {
  id: number;
  content: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{
  title = 'app';
  // store private response variable that has a type of Greeting response
  results: GreetingResponse;
  constructor(private http: HttpClient){}

  ngOnInit(): void {
    // call http client get method. Pass in URL, return observable that you subscribe to,
    // then when data comes back, use arrow function to set data to the results variable declared above 
    this.http.get <GreetingResponse>('https://principetomdemo.sandbox.paas.lmig.com/greeting').subscribe(data => {
      this.results = data;
    });
  }

}
