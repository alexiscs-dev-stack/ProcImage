# ProcImage

Aplicación Android creada con fines académicos durante el evento Tenerife GG para proponer un ejemplo de caso de uso real aplicando 3 modelos diferentes de IA:
Whisper para transformar audio a texto.
GPT-3.5 para analizar el texto.
DALL·E para generar imágenes.****


Guia para crear app que genere logos

# Tenerife GG(enerator)
## Generador de logotipos de eSports por IA

[![Kotlin](https://img.shields.io/badge/Kotlin-1.7-purple?longCache=true&style=popout-square)](https://kotlinlang.org)
[![Android Studio](https://img.shields.io/badge/Android_Studio-Flamingo-blue.svg?longCache=true&style=popout-square)](https://developer.android.com/studio)
[![Android](https://img.shields.io/badge/Android-7.1+-green.svg?longCache=true&style=popout-square)](https://www.android.com)

### Aplicación Android creada con fines académicos durante el evento [Tenerife GG](https://tenerife.gg/) para proponer un ejemplo de caso de uso real aplicando 3 modelos diferentes de IA:

* **[Whisper](https://platform.openai.com/docs/models/whisper)** para transformar audio a texto.
* **[GPT-3.5](https://platform.openai.com/docs/models/gpt-3-5)** para analizar el texto.
* **[DALL·E](https://platform.openai.com/docs/models/dall-e)** para generar imágenes.

Utiliza **[Jetpack Compose](https://developer.android.com/jetpack/compose)** para la IA y **[OpenAI Kotlin](https://github.com/aallam/openai-kotlin)** para interactuar con los modelos de OpenAI.

## Requisitos

Genera una API Key en **[https://platform.openai.com](https://platform.openai.com/)** *(User/API Keys/Create new secret key)*.

## Ejecución

Descarga el proyecto, ábrelo en Android Studio y añade la API Key en el fichero `conf/Env.kt`

```
const val OPENAI_API_KEY = "MI_KEY"
```

## APK

Puedes descargar un fichero ejecutable [APK](./app.apk) *(app.apk)* de prueba para instalar directamente en tu dispositivo Android. Deberás permitir la instalación de aplicaciones fuera de la tienda. 

Dispondrás de campo llamado *OpenAI API Key* para añadir tu propia clave desde la interfaz de usuario. Rellénalo y comienza a usarla.

<a href="./Media/4.png"><img src="./Media/4.png" style="height: 30%; width:30%;"/></a>

## Instrucciones

#### Completa los datos

* **Nombre del equipo**: El nombre que desees *(MoureDev)*.
* **¿A qué juegas?**: El nombre del juego en el que se va a inspirar el logotipo *(Diablo II)*.
* **Referencia principal**: El elemento principal del logotipo *(Fuego)*.

#### Añade información** *(Opcional)*

* **Iniciar grabación (Whisper)**: Graba un audio con información adicional *(Jugamos a Diablo II, me gustaría que el logo añada una calavera y mucho fuego)*.
* **Resumir (GPT-3.5)**: Extrae las palabras clave del audio *(juego, diablo, calavera, mucho fuego)*.

#### Genera el logo

* **Generar (DALL·E)** *(Diseño Tenerife GG OFF)*: Crea un logotipo con la información proporcionada.
* **Generar (DALL·E)** *(Diseño Tenerife GG ON)*: Crea un logotipo con la información proporcionada y una máscara predeterminada.
* **Copiar**: Guarda la URL del logotipo para descargarlo desde el explorador web.

<table style="width:100%">
<tr>
<td>
<a href="./Media/1.png">
<img src="./Media/1.png">
</a>
</td>
<td>
<a href="./Media/2.png">
<img src="./Media/2.png">
</a>
</td>
<td>
<a href="./Media/3.png">
<img src="./Media/3.png">
</a>
</td>
</tr>
</table>

[![Web](https://img.shields.io/badge/GitHub-MoureDev-14a1f0?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://github.com/mouredev)
