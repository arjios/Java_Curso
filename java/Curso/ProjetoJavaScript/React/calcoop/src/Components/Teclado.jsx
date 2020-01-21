import React, {Component} from 'react'
import './Teclado.css'
import Botao from './Botao'


export default class Teclado extends Component {
    render() {
        return (
            <div className="teclado">
                <Botao label = 'AC' />
                <Botao label = '+/-' />
                <Botao label = '%' />
                <Botao label = '/' />
                <Botao label = '7' />
                <Botao label = '8' />
                <Botao label = '9' />
                <Botao label = '*' />
                <Botao label = '4' />
                <Botao label = '5' />
                <Botao label = '6' />
                <Botao label = '-' />
                <Botao label = '1' />
                <Botao label = '2' />
                <Botao label = '3' />
                <Botao label = '+' />
                <Botao label = '=' />
            </div>
        )
    }
}
