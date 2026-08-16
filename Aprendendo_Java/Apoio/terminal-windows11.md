# Guia de Terminal — Windows 11 (PowerShell)

> Os comandos abaixo são para o **PowerShell** (padrão no Windows 11 e no Windows Terminal). Muitos comandos clássicos do antigo `cmd.exe` (como `dir`, `cd`, `cls`) também funcionam no PowerShell por compatibilidade, e estão indicados quando relevante.

## Navegação

| Comando | O que faz |
|---|---|
| `pwd` (ou `Get-Location`) | Mostra o diretório atual |
| `ls` (ou `dir` / `Get-ChildItem`) | Lista arquivos e pastas |
| `ls -Force` | Mostra também arquivos ocultos |
| `cd pasta` | Entra em uma pasta |
| `cd ..` | Volta um nível |
| `cd ../..` | Volta dois níveis |
| `cd ~` | Vai para a pasta do usuário |
| `cd \` | Vai para a raiz da unidade atual (ex: `C:\`) |
| `cd -` (ou `Set-Location -`) | Volta para a última pasta (nem sempre suportado, depende da versão) |

## Criação e manipulação de arquivos/pastas

| Comando | O que faz |
|---|---|
| `mkdir pasta` (ou `New-Item -ItemType Directory -Name pasta`) | Cria uma pasta |
| `New-Item arquivo.txt` | Cria um arquivo vazio |
| `Remove-Item arquivo.txt` (ou `rm arquivo.txt`) | Apaga um arquivo |
| `Remove-Item -Recurse pasta` | Apaga uma pasta e todo o conteúdo (cuidado!) |
| `Remove-Item -Recurse -Force pasta` | Igual acima, sem pedir confirmação (muito cuidado!) |
| `Copy-Item origem destino` (ou `cp`) | Copia arquivo |
| `Copy-Item -Recurse origem destino` | Copia pasta inteira |
| `Move-Item origem destino` (ou `mv`) | Move ou renomeia arquivo/pasta |
| `Rename-Item nome novo_nome` | Renomeia um arquivo ou pasta |

## Visualização de conteúdo

| Comando | O que faz |
|---|---|
| `Get-Content arquivo.txt` (ou `cat` / `type`) | Mostra o conteúdo inteiro do arquivo |
| `Get-Content arquivo.txt -Head 10` | Mostra as primeiras 10 linhas |
| `Get-Content arquivo.txt -Tail 10` | Mostra as últimas 10 linhas |
| `Get-Content arquivo.log -Wait` | Acompanha o arquivo em tempo real (como `tail -f`) |
| `more arquivo.txt` | Mostra com rolagem página por página |

## Busca

| Comando | O que faz |
|---|---|
| `Get-ChildItem -Recurse -Filter "*.txt"` | Busca arquivos por nome/extensão a partir da pasta atual |
| `Get-ChildItem -Recurse -Directory -Filter "pasta"` | Busca apenas diretórios |
| `Select-String "texto" arquivo.txt` | Busca um texto dentro de um arquivo (equivalente ao `grep`) |
| `Get-ChildItem -Recurse | Select-String "texto"` | Busca recursivamente em vários arquivos |
| `where.exe programa` | Localiza o caminho de um executável (equivalente ao `which` do Linux) |

## Permissões e informações de arquivo

| Comando | O que faz |
|---|---|
| `Get-Acl arquivo` | Mostra as permissões do arquivo |
| `icacls arquivo` | Exibe/edita permissões detalhadas (ACLs) |
| `Get-Item arquivo | Select-Object *` | Mostra todas as propriedades do arquivo |
| Terminal como administrador | Clique com botão direito no ícone do Terminal/PowerShell → "Executar como administrador" |

## Processos e sistema

| Comando | O que faz |
|---|---|
| `Get-Process` (ou `ps`) | Lista processos em execução |
| `Stop-Process -Id PID` (ou `kill PID`) | Encerra um processo pelo número (PID) |
| `Stop-Process -Name nome -Force` | Encerra um processo pelo nome, forçado |
| `Get-Volume` | Mostra espaço em disco disponível |
| `Get-ChildItem pasta -Recurse | Measure-Object -Property Length -Sum` | Calcula o tamanho total de uma pasta |
| `Get-Counter '\Memory\Available MBytes'` | Mostra memória RAM disponível |

## Pacotes (winget)

| Comando | O que faz |
|---|---|
| `winget search nome` | Procura um programa disponível |
| `winget install nome` | Instala um programa |
| `winget upgrade --all` | Atualiza todos os programas instalados via winget |
| `winget uninstall nome` | Remove um programa |

## Rede

| Comando | O que faz |
|---|---|
| `ping site.com` | Testa conectividade com um endereço |
| `Invoke-WebRequest url` (ou `curl`/`wget`, que são aliases no PowerShell) | Faz uma requisição HTTP |
| `ipconfig` | Mostra informações de rede/IP |
| `Test-NetConnection site.com -Port 443` | Testa conexão em uma porta específica |

## Dicas úteis

- **Tab** autocompleta nomes de arquivos, pastas e comandos — use sempre.
- Setas **↑ ↓** navegam pelo histórico de comandos digitados.
- `Get-History` (ou `history`) mostra o histórico completo de comandos.
- `Clear-Host` (ou `cls`) limpa a tela do terminal.
- **Ctrl+C** interrompe o comando em execução.
- Caminho relativo (`pasta\subpasta`) parte de onde você está; caminho absoluto (`C:\Usuarios\usuario\pasta`) parte da raiz da unidade.
- `Get-Help comando` mostra a documentação de um comando (ex: `Get-Help Get-ChildItem -Examples`).
- `Set-Alias nome comando` cria atalhos personalizados para comandos.
- Se preferir a sintaxe clássica de CMD, ela continua funcionando dentro do PowerShell para a maioria dos comandos básicos (`dir`, `cd`, `copy`, `del`, `cls` etc.).
