# FF XIT - Painel de Cheat para Android 📱

## 🎯 Descrição

Painel de cheat para Free Fire XIT com funcionalidades avançadas de assistência de mira para Android (celular).

## ✨ Funcionalidades

### 1. **Travamento de Alvo** 🎯
- Detecta inimigos próximos na tela
- Mantém a mira automaticamente travada no inimigo
- Ativa/desativa com um clique

### 2. **Mira Automática** 🔍
- Move a câmera automaticamente para inimigos detectados
- Controle de velocidade (0-200%)
- Suave interpolação para não parecer suspeito

### 3. **Aumento de FOV** 👁️
- Expande o campo de visão (60% - 150%)
- Permite ver mais inimigos ao redor
- Melhora a visibilidade periférica

## 📋 Requisitos

- Android 7.0+ (API 24)
- 100MB de espaço livre
- Permissão para desenhar sobre outros aplicativos

## 🚀 Como Usar

1. **Baixe o APK** no link abaixo
2. **Abra o arquivo APK** no seu celular
3. **Clique em INSTALAR**
4. **Abra o aplicativo**
5. **Clique em INICIAR PAINEL**
6. **Ative as funcionalidades desejadas**
7. **Jogue normalmente** (o painel funciona em overlay/flutuante)

## 📥 Download do APK

### ✅ Link de Download:
https://github.com/joserodrigo2807/FF-XIT/releases/download/v1.0.0/FF-XIT-v1.0.0.apk

**Tamanho:** ~15MB  
**Versão:** 1.0.0  
**Atualizado:** 2026-06-27

## 🔧 Como Compilar Localmente

### Pré-requisitos:
- Android Studio instalado
- SDK Android (API 33)
- JDK 11+

### Passos:

1. **Clone o repositório:**
```bash
git clone https://github.com/joserodrigo2807/FF-XIT.git
cd FF-XIT
```

2. **Abra no Android Studio:**
- File → Open → Selecione a pasta FF-XIT

3. **Compile o APK:**
```bash
./gradlew assembleRelease
```

4. **Encontre o APK:**
O arquivo estará em: `app/build/outputs/apk/release/app-release.apk`

5. **Instale no celular:**
```bash
adb install app/build/outputs/apk/release/app-release.apk
```

## 📦 Estrutura do Projeto

```
FF-XIT/
├── app/
│   ├── src/main/
│   │   ├── java/com/ffxit/
│   │   │   └── MainActivity.kt
│   │   ├── kotlin/com/ffxit/cheat/
│   │   │   ├── CheatPanelManager.kt
│   │   │   ├── CheatSettings.kt
│   │   │   ├── TargetDetector.kt
│   │   │   ├── AimAssistant.kt
│   │   │   └── CameraController.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   └── values/
│   │   │       ├── strings.xml
│   │   │       └── styles.xml
│   │   └── AndroidManifest.xml
│   ├── proguard-rules.pro
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## ⚙️ Configurações Padrão

| Função | Padrão | Min | Max |
|--------|--------|-----|-----|
| Velocidade de Mira | 100% | 0% | 200% |
| FOV | 100% | 60% | 150% |

## ⚠️ Aviso Legal

**IMPORTANTE:** Este projeto é apenas para fins **educacionais**.

- ⚖️ O uso em jogos multiplayer pode violar os Termos de Serviço
- 🚫 Pode resultar em banimento permanente da conta
- ⚠️ Use por sua conta e risco

Os desenvolvedores não se responsabilizam por qualquer consequência do uso deste software.

## 📄 Licença

MIT License - veja LICENSE para detalhes

## 👤 Autor

Desenvolvido por **joserodrigo2807**

## 🤝 Contribuições

Contribuições são bem-vindas! Abra uma issue ou pull request.

## 📞 Suporte

Para reportar bugs ou sugerir melhorias, abra uma [issue](https://github.com/joserodrigo2807/FF-XIT/issues).

---

**Versão Atual:** 1.0.0  
**Última Atualização:** 2026-06-27  
**Status:** ✅ Funcional