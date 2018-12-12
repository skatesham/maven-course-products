# maven-course-products
Projeto com Maven

Tambem foi desenvolvido uma [aplicação web](https://github.com/skatesham/webapp-jetty-maven).

### Criando Projecto Quickstart Maven
```mvn archetype:generate -DartifactId=produtos -DgroupId=br.com.alura.maven -DinteractiveMode=false -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.3```

### Instalar pluggin para página html com testes. Primeiro declararemos o nome do plugin, em seguida o nome do objetivo no caso, surefire-report: e report.
`mvn surefire-report:report`

### Compile
`mvn compile`

### Para criar jar
``` <packaging>jar</packaging> ```  
`mvn package`

### para executar um arquivo jar criado pelo maven... -cp (classpath do jar) + pacote.pacote.Class (classe que contem o Main)
`java -cp target/produtos-1.0-SNAPSHOT.jar br.com.alura.maven.App`

### Criar site com teste de qualidade
`mvn pmd:pmd`

### Utilizando PMD para verificar o build e garantir que o código está otimizado
`mvn pmd:check`

### Configurar o PMD para operar quando executar verify ou compile
```
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-pmd-plugin</artifactId>
				<version>3.11.0</version>
				<executions>
					<execution>
						<id>execution1</id>
						<phase>verify</phase>
						<goals>
							<goal>check</goal>
						</goals>
					</execution>
					<execution>
						<id>execution2</id>
						<phase>compile</phase>
						<goals>
							<goal>check</goal>
						</goals>
					</execution>
					<execution>
						<id>execution3</id>
						<phase>package</phase>
						<goals>
							<goal>check</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
    <build>
    
    
### Certificado do Curso
![alt text](https://raw.githubusercontent.com/skatesham/webapp-jetty-maven/master/src/main/webapp/static/img/certificado.png).

#### Curso Maven: Build do zero a web
Esse projeto é o baseado no trabalho final do [Curso Maven: Build do zero a web](https://cursos.alura.com.br/course/maven-build-do-zero-a-web).

##### Desenvolvido por Sham Vinicius Fiorin
```
