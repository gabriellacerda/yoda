import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  items = [
    {
      url: 'eoq.mp3',
      name: 'eoq'
    },
    {
      url: 'soladomaluco.mp3',
      name: 'solado maluco'
    },
    {
      url: 'enoismaluco.mp3',
      name: 'e nois maluco'
    },
    {
      url: 'sehloiro.mp3',
      name: 'sehloiro'
    },
    {
      url: 'lagoaquilagoai.mp3',
      name: 'lagoaquilagoai'
    },
    {
      url: 'circodesoled.mp3',
      name: 'circo de soled'
    },
    {
      url: 'opafion.mp3',
      name: 'opa fion'
    },
    {
      url: 'iihhrrl.mp3',
      name: 'HIIIIIII'
    },
    {
      url: 'fezumapradeusver.mp3',
      name: 'Pra deus ver'
    },
    {
      url: 'trabson.mp3',
      name: 'Trabson'
    },
    {
      url: 'fon.mp3',
      name: 'Fon'
    },
    {
      url: 'queeeee.mp3',
      name: 'QUEEEEE'
    }
  ];

  constructor(public navCtrl: NavController) {

  }

  playAudio (url) {
    let getUrl = '/assets/media/' + url;
    // console.log('Reproduzindo: ' + getUrl);
    var audio = new Audio(getUrl);
    audio.play();
  }

}
