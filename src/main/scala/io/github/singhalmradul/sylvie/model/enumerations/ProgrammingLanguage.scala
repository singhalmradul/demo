package io.github.singhalmradul.sylvie.model.enumerations

enum ProgrammingLanguage(extension: String):
  case Python extends ProgrammingLanguage(".py")
  case Java extends ProgrammingLanguage(".java")
  case JavaScript extends ProgrammingLanguage(".js")
