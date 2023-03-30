## Fork of infra-gitpod-template
- https://github.com/leosavio/infra-gitpod-template

## install springboot cli
```
sdk install springboot
spring init --dependencies=web,jpa,h2 --java-version=20 --build=maven myprojectname
```

## Add to application.properties to enable h2 console
```
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.trace=false
spring.h2.console.settings.web-allow-others=false
```

## H2 url
- Check the gitpod url on Ports tab
```
http://gitpod-url:8080/h2-console
```

## Get the h2 url in application startup
##H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:9914428f-357d-4992-a8a0-ac78a1e6805e'

## Create all classes from repo

## Change ApplicationStartup.java values

## Run application
```
mvn spring-boot:run
```

## Access the get method of api on browser to get json 
```
{"nome":"CHANGEALLVALUES","preco":1200.0,"pessoaInstrutora":"CHANGEALLVALUES"}
```

## On thunder client at gitpod configure ALL methods of api and test:
Sample return:
```
{
  "id": 2,
  "nome": "CHANGEALLVALUES",
  "preco": 1200.0,
  "pessoaInstrutora": "CHANGEALLVALUES"
}
```

## Export the collection of Thunder client into project folder
thunder-collection_Javaweek.json

## Commit
```
../git-push-all.sh 
```

## Its done

### Troubleshooting

## Erros with java plugins:
- https://stackoverflow.com/questions/61826895/how-to-avoid-visual-studio-code-warning-myfile-java-is-a-non-project-file-o
```
Try cleaning the Java language server workspace:

Cmd + Shift + P  to show the command palette
Choose or type "Java: Clean the Java language server workspace"
Restart and Delete
It just worked for me.
```