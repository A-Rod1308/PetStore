import { Component, Input, OnInit } from '@angular/core';
import { PetsService } from 'src/app/services/pets.service';
import { PetsInterface } from 'src/app/models/petsInterface';
import samplePets from 'src/app/models/samplepets';

@Component({
  selector: 'app-all-pets',
  templateUrl: './all-pets.component.html',
  styleUrls: ['./all-pets.component.css'],
})
export class AllPetsComponent implements OnInit {
  // @Input() pets: PetsInterface;
  pets = samplePets;

  constructor(private petsService: PetsService) {}

  ngOnInit(): void {}
}
