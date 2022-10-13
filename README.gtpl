<p align="center"><a href="https://github.com/anuraghazra/github-readme-stats">
  <img align="center" src="https://github-readme-stats.vercel.app/api?username=brugr&show_icons=true&theme=dark" />
</a></p>

### 📊 WakaTime
<!--START_SECTION:waka-->
<!--END_SECTION:waka-->

### 👷 Latest commits
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 3 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
