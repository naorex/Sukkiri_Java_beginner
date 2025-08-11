```mermaid
classDiagram

class Hero{
    +name string
    +hp int
    +attack() void
    +run() void
}

class SuperHero{
    +flying bool
    +fly() void
    +land() void
    +run() void
}

Hero <|-- SuperHero : inheritance

```
