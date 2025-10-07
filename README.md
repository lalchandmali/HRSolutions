# Carousell Marketplace - CLI Implementation


Simple CLI marketplace implementation in Java following SOLID principles.


Requirements
- Java 11 (OpenJDK 11)
- Linux (Debian 9)


Build & Run
```bash
chmod +x build.sh run.sh
./build.sh
./run.sh < input.txt
```


`build.sh` compiles all Java sources into `out` directory.
`run.sh` runs the application (main class: `marketplace.Main`).


Design highlights
- Clear separation of responsibilities: models, repositories, services, command handler.
- Username uniqueness is case-insensitive.
- Category counts maintained for efficient `GET_TOP_CATEGORY`.
