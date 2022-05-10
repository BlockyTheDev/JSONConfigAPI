![Java](https://img.shields.io/badge/Java%20version-16-orange)
![Open issues](https://img.shields.io/github/issues-raw/neros2k/JSONConfigAPI)
---
[![Dropbox](https://img.shields.io/badge/JSONConfigAPI-Dropbox-blue)]()
[![SpigotMC](https://img.shields.io/badge/JSONConfigAPI-SpigotMC-yellow)]()
[![SourceForge](https://img.shields.io/badge/JSONConfigAPI-SourceForge-orange)]()
[![Trello](https://img.shields.io/badge/JSONConfigAPI-Trello-blue)](https://trello.com/c/jMOOAFJh/15-jsonconfigapi)
[![CurseForge](https://img.shields.io/badge/JSONConfigAPI-CurseForge-green)]()

# Описание
**JSONConfigAPI** - простейший способ создать JSON-конфигурацию в совершенно любом SpigotAPI плагине.

# Пример использования
```java
public final class ApiTest extends JavaPlugin {
    @Override void onEnable() {
        JSONConfig<Model> JSON_CONFIG = JCApi.getNew(this, Model.class, "config.json").get()
                .createConfig()
                .reload();
        this.getLogger().info(JSON_CONFIG.getJson().DATA);
    }
}
class Model { String DATA; }
```
```json
{
  "DATA": "go erp"
}
```

# Установка на сервере
Для того, чтобы установить API, потребуеться лишь положить **.jar** файл в директорию плагинов вашего сервера (**/plugins**). API автоматически установится при запуске/перезагрузке сервера.
> Доступные версии: 1.17; 1.17.1; 1.18; 1.18.1; 1.18.2. Доступные ядра: Spigot, Paper, и прочие форки упомянутых.

# Установка в проекте
Учтите, что для работы API в проекте требуется установленный экземпляр на сервере.
```xml
<dependency>
    <groupId>neros2k.jcapi</groupId>
    <artifactId>JSONConfigAPI</artifactId>
    <version>1.0</version>
</dependency>
```
```xml
<repository>
    <id>JSONConfigAPI-mvn-repo</id>
    <url>https://raw.github.com/neros2k/JSONConfigAPI/mvn-repo/</url>
    <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
    </snapshots>
</repository>
```
```yml
depend:
  - JSONConfigAPI
```
