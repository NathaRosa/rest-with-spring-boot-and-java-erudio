package br.com.natharosa.exception;

import java.time.LocalDateTime;
import java.util.Date;

public record ExceptionResponse(LocalDateTime timestamp, String message, String details) {}