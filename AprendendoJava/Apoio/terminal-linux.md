# Guia de Terminal — Linux

## Navegação

| Comando | O que faz |
|---|---|
| `pwd` | Mostra o diretório atual (print working directory) |
| `ls` | Lista arquivos e pastas |
| `ls -l` | Lista detalhada (permissões, tamanho, data) |
| `ls -a` | Mostra arquivos ocultos (começam com `.`) |
| `ls -la` | Combina detalhada + ocultos |
| `cd pasta` | Entra em uma pasta |
| `cd ..` | Volta um nível |
| `cd ../..` | Volta dois níveis |
| `cd ~` ou `cd` | Vai para a pasta home do usuário |
| `cd /` | Vai para a raiz do sistema |
| `cd -` | Volta para a última pasta em que você estava |

## Criação e manipulação de arquivos/pastas

| Comando | O que faz |
|---|---|
| `mkdir pasta` | Cria uma pasta |
| `mkdir -p a/b/c` | Cria pastas aninhadas de uma vez |
| `touch arquivo.txt` | Cria um arquivo vazio (ou atualiza a data de modificação) |
| `rm arquivo.txt` | Apaga um arquivo |
| `rm -r pasta` | Apaga uma pasta e todo o conteúdo (cuidado!) |
| `rm -rf pasta` | Igual acima, mas sem pedir confirmação (muito cuidado!) |
| `cp origem destino` | Copia arquivo |
| `cp -r origem destino` | Copia pasta inteira |
| `mv origem destino` | Move ou renomeia arquivo/pasta |

## Visualização de conteúdo

| Comando | O que faz |
|---|---|
| `cat arquivo.txt` | Mostra o conteúdo inteiro do arquivo |
| `less arquivo.txt` | Mostra com rolagem (sai com `q`) |
| `head arquivo.txt` | Mostra as primeiras 10 linhas |
| `head -n 20 arquivo.txt` | Mostra as primeiras 20 linhas |
| `tail arquivo.txt` | Mostra as últimas 10 linhas |
| `tail -f arquivo.log` | Acompanha o arquivo em tempo real (útil para logs) |

## Busca

| Comando | O que faz |
|---|---|
| `find . -name "*.txt"` | Busca arquivos por nome a partir da pasta atual |
| `find . -type d -name "pasta"` | Busca apenas diretórios |
| `grep "texto" arquivo.txt` | Busca um texto dentro de um arquivo |
| `grep -r "texto" .` | Busca recursivamente em todos os arquivos da pasta |
| `grep -ri "texto" .` | Igual acima, ignorando maiúsculas/minúsculas |
| `locate arquivo` | Busca rápida por nome (usa índice do sistema) |

## Permissões e dono de arquivos

| Comando | O que faz |
|---|---|
| `chmod +x script.sh` | Torna um arquivo executável |
| `chmod 755 arquivo` | Define permissões específicas (leitura/escrita/execução) |
| `chown usuario:grupo arquivo` | Muda o dono e grupo do arquivo |
| `sudo comando` | Executa um comando com privilégios de administrador |

## Processos e sistema

| Comando | O que faz |
|---|---|
| `ps aux` | Lista processos em execução |
| `top` ou `htop` | Monitor de processos em tempo real |
| `kill PID` | Encerra um processo pelo número (PID) |
| `kill -9 PID` | Força o encerramento de um processo |
| `df -h` | Mostra espaço em disco disponível |
| `du -sh pasta` | Mostra o tamanho total de uma pasta |
| `free -h` | Mostra uso de memória RAM |

## Pacotes (Ubuntu/Debian)

| Comando | O que faz |
|---|---|
| `sudo apt update` | Atualiza a lista de pacotes disponíveis |
| `sudo apt upgrade` | Atualiza os pacotes instalados |
| `sudo apt install nome` | Instala um pacote |
| `sudo apt remove nome` | Remove um pacote |

## Rede

| Comando | O que faz |
|---|---|
| `ping site.com` | Testa conectividade com um endereço |
| `curl url` | Faz uma requisição HTTP e mostra o resultado |
| `wget url` | Baixa um arquivo da internet |
| `ifconfig` ou `ip a` | Mostra informações de rede/IP |

## Dicas úteis

- **Tab** autocompleta nomes de arquivos e comandos — use sempre.
- Setas **↑ ↓** navegam pelo histórico de comandos digitados.
- `history` mostra o histórico completo de comandos.
- `clear` ou **Ctrl+L** limpa a tela do terminal.
- **Ctrl+C** interrompe o comando em execução.
- Caminho relativo (`pasta/subpasta`) parte de onde você está; caminho absoluto (`/home/usuario/pasta`) parte da raiz.
- `man comando` mostra o manual de um comando (sai com `q`).
- `alias nome="comando"` cria atalhos personalizados para comandos.
