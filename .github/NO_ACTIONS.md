Este repositório não contém workflows do GitHub Actions por decisão do mantenedor.

Motivo:
- Evitar que ações/CI sejam executadas automaticamente ao subir o projeto para o GitHub.

Como reativar Actions (opções):
1. Re-adicionar um arquivo de workflow em `.github/workflows/` (ex.: `maven.yml`).
2. Na interface do GitHub, vá em `Settings` -> `Actions` e ajuste as permissões para permitir Actions.
3. Se a organização bloqueia Actions, peça ao administrador para alterar a política da organização.

Comandos para subir as mudanças (PowerShell):
```
git add -A; git commit -m "Remove GitHub Actions workflows"; git push origin main
```

Observações:
- Se preferir manter o arquivo de workflow mas impedir execuções, adicione `if: false` no topo do job ou use condicionais em cada job.
- Excluir o workflow é a forma mais direta de garantir que o Actions não rode após o push.

Se quiser, eu removo outros workflows ou faço o ajuste `if: false` em vez de deletar — diga qual prefere.
