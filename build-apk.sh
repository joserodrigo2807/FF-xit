#!/bin/bash
# Script para compilar o APK do FF-XIT

echo "=========================================="
echo "  FF XIT - Build APK v1.0.0"
echo "=========================================="
echo ""

# Verificar se Gradle wrapper existe
if [ ! -f "gradlew" ]; then
    echo "❌ Erro: gradlew não encontrado!"
    echo "Execute este script na raiz do projeto FF-XIT"
    exit 1
fi

# Limpar build anterior
echo "🧹 Limpando build anterior..."
./gradlew clean

# Compilar APK de release
echo ""
echo "🏗️  Compilando APK de release..."
./gradlew assembleRelease

# Verificar se compilação foi bem-sucedida
if [ -f "app/build/outputs/apk/release/app-release.apk" ]; then
    echo ""
    echo "=========================================="
    echo "✅ APK compilado com sucesso!"
    echo "=========================================="
    echo ""
    echo "📍 Localização: app/build/outputs/apk/release/app-release.apk"
    echo ""
    echo "📦 Próximos passos:"
    echo "   1. Copie o APK para seu celular"
    echo "   2. Abra o arquivo no celular"
    echo "   3. Clique em INSTALAR"
    echo "   4. Abra o aplicativo e clique em INICIAR PAINEL"
    echo ""
else
    echo "❌ Erro na compilação!"
    exit 1
fi
