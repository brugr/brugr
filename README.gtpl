<p align="center"><a href="https://github.com/anuraghazra/github-readme-stats">
  <img align="center" src="https://github-readme-stats.vercel.app/api?username=brugr&show_icons=true&theme=github_dark" />
</a></p>

<p align="center"><a href="https://wakatime.com/@brugr">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@brugr/092f33d5-13de-4518-bc1e-34a79102d8c2.svg" />
</a></p>

### 👷 Repos with latest commits
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
