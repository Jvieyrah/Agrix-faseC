package com.betrybe.agrix.ebytr.staff.controller.dto;

import com.betrybe.agrix.ebytr.staff.entity.Person;

/**
 * Class representing a person response DTO.
 */
public record PersonResponseDto(Long id, String username, String role) {

  public static PersonResponseDto fromEntity(Person person) {
    return new PersonResponseDto(person.getId(), person.getUsername(), person.getRole().getName());
  }
}


