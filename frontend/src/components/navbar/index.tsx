import { ReactComponent as GithubIcon } from "assets/github-icon.svg"
import 'components/navbar/styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>InfoMovies</h1>
                    <a href="https://github.com/luccaslombardi" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/luccaslombardi</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}

export default Navbar;