{
  "datasource": {
    "url": "jdbc:postgresql://{{ .Env.POSTGRES_HOST }}:{{ .Env.POSTGRES_PORT }}/musicdb"
  },
  "mongo": {
    "url": "mongodb://{{ .Env.MONGO_HOST }}:{{ .Env.MONGO_PORT }}"
  }
}
