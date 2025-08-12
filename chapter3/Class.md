```mermaid
classDiagram

class Hero{
    +name string
    +hp int
    +attack() void
    +run() void
    +slip() void
    +Hero() void
}

class SuperHero{
    +flying bool
    +fly() void
    +land() void
    +run() void
    +attack() void
    +SuperHero() void
}

Hero <|-- SuperHero : inheritance

```
