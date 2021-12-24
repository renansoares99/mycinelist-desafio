import { http } from "./api"

export default {

    saveFilme(filme) {
        return http.post('/filme', filme)
    }
}